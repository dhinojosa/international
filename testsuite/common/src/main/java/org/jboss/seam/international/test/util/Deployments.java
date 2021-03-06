/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.international.test.util;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

/**
 * @author <a href="http://community.jboss.org/people/kenfinni">Ken Finnigan</a>
 *
 */
public class Deployments {

    public static WebArchive createWebArchive() {
        return ShrinkWrap
                .create(WebArchive.class, "test.war");
    }

    public static WebArchive addEmptyBeansXML(WebArchive arc) {
        return arc.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    public static WebArchive removeSeamInternational(WebArchive arc) {
        arc.delete(ArchivePaths.create("WEB-INF/lib/seam-international-3.0.1-SNAPSHOT.jar"));
        return arc;
    }
}
