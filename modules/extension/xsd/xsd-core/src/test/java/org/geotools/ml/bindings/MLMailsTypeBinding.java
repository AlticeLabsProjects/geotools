/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.ml.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Strategy object for the type http://mails/refractions/net:mailsType.
 *
 * <p>
 *
 * <pre>
 *         <code>
 *  &lt;xsd:complexType name="mailsType"&gt;
 *      &lt;xsd:sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *          &lt;xsd:element name="mail" type="ml:mailType"/&gt;
 *      &lt;/xsd:sequence&gt;
 *  &lt;/xsd:complexType&gt;
 *
 *          </code>
 *         </pre>
 *
 * @generated
 */
public class MLMailsTypeBinding extends AbstractComplexBinding {
    /** @generated */
    public QName getTarget() {
        return ML.MAILSTYPE;
    }

    public Class getType() {
        return List.class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        ArrayList<Object> list = new ArrayList<>();
        List<Node> children = node.getChildren();

        for (Node child : children) {
            list.add(child.getValue());
        }

        return list;
    }

    @Override
    public Object getProperty(Object object, QName name) throws Exception {
        if ("mail".equals(name.getLocalPart())) {
            return object;
        }

        return null;
    }
}
