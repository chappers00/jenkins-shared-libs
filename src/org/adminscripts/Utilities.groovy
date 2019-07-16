package org.adminscripts

class Utilities implements Serializable {
    def steps
    Utilities(steps) {this.steps = steps}
    def mvn(args) {
        steps.sh "${tool mvn_version}/bin/mvn -o ${args}"
    }
}