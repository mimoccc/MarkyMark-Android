/*
* Copyright (C) M2mobi BV - All Rights Reserved
*/

package com.m2mobi.markymarkcommon.markdownitems;

import com.m2mobi.markymark.item.MarkDownItem;
import com.m2mobi.markymark.item.inline.MarkDownString;
import com.m2mobi.markymarkcommon.markdownitems.inline.InlineString;

/**
 * {@link MarkDownItem} used for storing text inside a quote block
 */
public class QuoteBlock implements MarkDownItem {

	private final String mContent;

	public QuoteBlock(final String pContent) {
		mContent = pContent;
	}

	public MarkDownString getContent() {
		return new InlineString(mContent, true);
	}
}