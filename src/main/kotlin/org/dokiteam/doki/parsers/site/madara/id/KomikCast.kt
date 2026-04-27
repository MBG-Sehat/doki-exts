package org.dokiteam.doki.parsers.site.madara.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("KOMIKCAST", "KomikCast", "id")
internal class KomikCast(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KOMIKCAST, "v2.komikcast.fit", 20) {
	override val tagPrefix = "genres/"
	override val listUrl = "comics/"
	override val datePattern = "MMMM d, yyyy"
}
