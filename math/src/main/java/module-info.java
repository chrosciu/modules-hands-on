module eu.chrost.math {
    exports eu.chrost.math;
    provides eu.chrost.math.Operation with eu.chrost.math.internal.Addition, eu.chrost.math.internal.Subtraction;
    requires transitive eu.chrost.utils;
}