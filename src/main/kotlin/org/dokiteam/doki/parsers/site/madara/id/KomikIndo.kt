package org.dokiteam.doki.parsers.site.madara.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("KOMIKINDO", "KomikIndo", "id")
internal class KomikIndo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KOMIKINDO, "komikindo.ch", 20) {
	override val tagPrefix = "genres/"
	override val listUrl = "komik/"
	override val datePattern = "d MMMM yyyy"
}
