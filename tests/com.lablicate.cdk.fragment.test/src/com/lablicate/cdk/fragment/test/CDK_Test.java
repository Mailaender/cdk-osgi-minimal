/*******************************************************************************
 * Copyright (c) 2013, 2024 Lablicate GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Matthias Mailänder - initial API and implementation
 *******************************************************************************/
package com.lablicate.cdk.fragment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openscience.cdk.exception.InvalidSmilesException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IChemObjectBuilder;
import org.openscience.cdk.silent.SilentChemObjectBuilder;
import org.openscience.cdk.smiles.SmilesParser;

public class CDK_Test {

	@Test
	public void testNameToStructure() {
		IChemObjectBuilder builder = SilentChemObjectBuilder.getInstance();
		SmilesParser parser = new SmilesParser(builder);

		try {
			IAtomContainer caffeine = parser.parseSmiles("CN1C=NC2=C1C(=O)N(C(=O)N2C)C caffeine");
			assertEquals(14, caffeine.getAtomCount());
		} catch (InvalidSmilesException e) {
			e.printStackTrace();
		}
	}
}
