package br.com.devsrsouza.svg2compose

import java.io.File

fun main() {
    val iconTest = File("raw-icons")
    val src = File("build/generated-icons").apply { mkdirs() }

    Svg2Compose.parse(
        applicationIconPackage = "br.com.compose.icons",
        accessorName = "EvaIcons",
        outputSourceDirectory = src,
        vectorsDirectory = iconTest,
        type = VectorType.DRAWABLE,
        iconNameTransformer = { name, group -> name }
    )
}
