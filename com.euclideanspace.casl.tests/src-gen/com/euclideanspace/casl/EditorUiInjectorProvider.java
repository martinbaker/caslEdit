/*
* generated by Xtext
*/
package com.euclideanspace.casl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EditorUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.euclideanspace.casl.ui.internal.EditorActivator.getInstance().getInjector("com.euclideanspace.casl.Editor");
	}
	
}
