package br.com.devsrsouza.svg2compose

import java.util.Stack

fun <T> Stack<T>.peekOrNull(): T? = runCatching { peek() }.getOrNull()