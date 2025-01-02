package jmous;

import java.util.List;
import java.util.Map;

class MousClass implements MousCallable {
    final String name;
    final MousClass superclass;
    private final Map<String, MousFunction> methods;

    MousClass(String name, MousClass superclass, Map<String, MousFunction> methods){ 
        this.superclass = superclass;
        this.name = name;
        this.methods = methods;
    }

    MousFunction findMethod(String name){
        if (methods.containsKey(name)){
            return methods.get(name);
        }

        if (superclass != null) {
            return superclass.findMethod(name);
        }

        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        MousInstance instance = new MousInstance(this);
        MousFunction initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }
        return instance;
    }

    @Override
    public int arity(){
        MousFunction initializer = findMethod("init");
        if (initializer == null) return 0;
        return initializer.arity();
    }
}
