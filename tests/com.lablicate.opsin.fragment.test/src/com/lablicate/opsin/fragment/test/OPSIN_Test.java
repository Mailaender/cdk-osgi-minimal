/*******************************************************************************
 * Copyright (c) 2013, 2022 Marwin Wollschläger.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marwin Wollschläger - initial API and implementation
 * Dr. Philip Wenig - adjustments
 *******************************************************************************/
package com.lablicate.opsin.fragment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.opsin.NameToStructure;
import uk.ac.cam.ch.wwmm.opsin.NameToStructureConfig;
import uk.ac.cam.ch.wwmm.opsin.OpsinResult;

public class OPSIN_Test {

	@Test
	public void testNameToStructure() {

		NameToStructure nameStructure = NameToStructure.getInstance();
		NameToStructureConfig nameStructureConfig = new NameToStructureConfig();
		nameStructureConfig.setAllowRadicals(true);
		OpsinResult result = nameStructure.parseChemicalName("Iminostilbene", nameStructureConfig);
		assertEquals("APPEARS_AMBIGUOUS: Connection of imino to stilben", result.getMessage());
		assertEquals("N=C1C(C=CC=C1)C=CC1=CC=CC=C1", result.getSmiles());
	}
}
