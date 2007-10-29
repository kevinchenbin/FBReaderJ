package org.zlibrary.model.entry;

import org.zlibrary.model.ZLTextAlignmentType;

public interface ZLTextForcedControlEntry extends ZLTextParagraphEntry{
    boolean leftIndentSupported();
	
	short leftIndent();
	
	void setLeftIndent(short leftIndent);
   
	boolean rightIndentSupported();
	
	short rightIndent();
	
	void setRightIndent(short rightIndent);

	boolean alignmentTypeSupported();
	
	ZLTextAlignmentType alignmentType();
	
	void setAlignmentType(ZLTextAlignmentType alignmentType);

}