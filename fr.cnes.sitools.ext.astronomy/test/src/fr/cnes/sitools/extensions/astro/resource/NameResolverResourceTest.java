 /*******************************************************************************
 * Copyright 2010-2014 CNES - CENTRE NATIONAL d'ETUDES SPATIALES
 *
 * This file is part of SITools2.
 *
 * SITools2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SITools2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SITools2.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package fr.cnes.sitools.extensions.astro.resource;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;

import fr.cnes.sitools.common.SitoolsSettings;
import fr.cnes.sitools.extensions.common.Utility;
import fr.cnes.sitools.plugins.resources.model.ResourceModel;
import fr.cnes.sitools.project.model.Project;
import fr.cnes.sitools.server.Consts;
import fr.cnes.sitools.test.common.AbstractSitoolsServiceTestCase;
import org.codehaus.jackson.JsonNode;

/**
 *
 * @author Jean-Christophe Malapert
 */
public class NameResolverResourceTest extends AbstractSitoolsServiceTestCase {

    private final String urlAttachment = "/testnameresolver";
    private final String projectName = "test";
    private Project pj;
    private ResourceModel rm;

    @Before
    @Override
    public void setUp() throws IOException, Exception {
        setMediaTest(MediaType.APPLICATION_JSON);
        pj = createProjectObject(projectName, this.urlAttachment);
        createProject(pj);
        activateProject(pj);
        rm = createResourceModel(fr.cnes.sitools.extensions.astro.resource.NameResolverResourcePlugin.class.getName(), "nameResolver", "/plugin/nameResolver/{objectName}/{coordSystem}");
        create(rm, getBaseUrl() +SitoolsSettings.getInstance().getString(Consts.APP_PROJECTS_URL) +"/"+projectName);              
    }

    @After
    @Override
    public void tearDown() throws IOException, Exception {
        delete(rm, getBaseUrl() +SitoolsSettings.getInstance().getString(Consts.APP_PROJECTS_URL)+ "/"+projectName);
        deleteProject(pj);        
    }

    @Test
    public void testGetNameResolverResponse() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        System.out.println("getNameResolverResponse");
        ClientResource clientResource = new ClientResource(getHostUrl() + this.urlAttachment + "/plugin/nameResolver/m31/EQUATORIAL");
        JsonNode result = Utility.mapper.readValue(clientResource.get(MediaType.APPLICATION_JSON).getText(), JsonNode.class);
        JsonNode expResult = Utility.mapper.readTree("{\"totalResults\":1,\"features\":[{\"properties\":{\"crs\":{\"properties\":{\"name\":\"equatorial.ICRS\"},\"type\":\"name\"},\"credits\":\"CDS\",\"identifier\":\"CDS0\"},\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[10.6847083,41.26875]}}],\"type\":\"FeatureCollection\"}");
//        JSONObject result = new JSONObject(clientResource.get(MediaType.APPLICATION_JSON).getText());
//        JSONObject expResult = new JSONObject("{\"totalResults\":1,\"features\":[{\"properties\":{\"crs\":{\"properties\":{\"name\":\"equatorial.ICRS\"},\"type\":\"name\"},\"credits\":\"CDS\",\"identifier\":\"CDS0\"},\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[10.6847083,41.26875]}}],\"type\":\"FeatureCollection\"}");        
        assertEquals(expResult.toString(), result.toString());
    }
}
