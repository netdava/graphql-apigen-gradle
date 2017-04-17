package com.netdava.gradle.graphql

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

class GraphQLPluginTest extends GroovyTestCase {

    @Test
    void graphqlPluginAddsGraphQLTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.netdava.graphql'

        assertTrue(project.tasks.graphql instanceof Task)
    }
}
