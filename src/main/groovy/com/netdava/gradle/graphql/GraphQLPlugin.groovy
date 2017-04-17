package com.netdava.gradle.graphql

import org.gradle.api.Plugin
import org.gradle.api.Project

class GraphQLPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("graphql", GraphQLPluginExtension)

        project.task('graphql') {
            doLast {
                println "GraphQL: ${project.graphql.defaultPackageName} from ${project.graphql.guiceModuleName}"
            }
        }
    }
}
