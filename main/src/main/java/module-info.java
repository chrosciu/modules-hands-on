module eu.chrost.main {
    requires eu.chrost.math;
    uses eu.chrost.math.Operation;

    requires eu.chrost.model;
    requires com.google.gson;

    opens eu.chrost.main to com.google.gson;
}