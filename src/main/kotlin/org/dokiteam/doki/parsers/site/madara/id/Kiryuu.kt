package org.dokiteam.doki.parsers.site.madara.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("KIRYUU", "Kiryuu", "id")
internal class Kiryuu(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KIRYUU, "v5.kiryuu.to", 20) {
	override val tagPrefix = "genres/"
	override val listUrl = "manga/"
	override val datePattern = "MMMM d, yyyy"
}
