/*
 * Copyright 2012 Rob Fletcher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grails.servlet.version = '2.5'
grails.project.work.dir = 'target'
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
		inherits true
		grailsHome()
        grailsCentral()
		grailsPlugins()
        mavenCentral()
        mavenLocal()
    }

    dependencies {
		test 'javassist:javassist:3.12.0.GA'
		test 'org.jodd:jodd-wot:3.3.1'
    }

    plugins {
        build(':release:1.0.1') { export = false }
		test(':spock:0.6-SNAPSHOT') { export = false }
    }

}
