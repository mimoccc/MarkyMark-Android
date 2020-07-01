/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2020 M2mobi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.m2mobi.markymark.core.interpreter

import com.m2mobi.markymark.core.model.Block
import com.m2mobi.markymark.core.model.Styling
import com.m2mobi.markymark.core.parser.Parser

/**
 * Basic definition of an Interpreter. An Interpreter is responsible for converting the intermediary representations
 * (i.e. [Block] and [Styling]) into end products that can be displayed by a UI/GUI/View.
 *
 * The Interpreter can be seen as the output equivalent of the [Parser].
 */
interface Interpreter<T, R> {

    fun interpret(model: T): R
}
