package org.dokiteam.doki.parsers.site.madara.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.ContentType
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("DOUJINDESU", "Doujindesu", "id", ContentType.HENTAI)
internal class Doujindesu(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJINDESU, "doujindesu.tv", 20) {
	override val tagPrefix = "genres/"
	override val listUrl = "manga/"
	override val datePattern = "MMMM d, yyyy"
}
