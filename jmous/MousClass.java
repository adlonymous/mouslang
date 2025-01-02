package jmous;

import java.util.List;
import java.util.Map;

class MousClass implements MousCallable {
    final String name;
    private final Map<String, MousFunction> methods;

    LoxClass(String name) {
        this.name = name;
        this.methods = methods;
    }

    LoxFunction findMethod(String name){
        if (methods.containsKey(name)){
            return methods.get(name);
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
