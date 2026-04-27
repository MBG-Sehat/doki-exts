package org.dokiteam.doki.parsers.site.madara.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("IKIRU", "Ikiru", "id")
internal class Ikiru(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IKIRU, "04.ikiru.wtf", 20) {
	override val tagPrefix = "genres/"
	override val listUrl = "manga/"
	override val datePattern = "MMMM d, yyyy"
}
