package jmous;

import java.util.List;

interface MousCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
