import kotlin.test.*


fun box() {
    val map = listOf("a", "bb", "ccc").associate { it.length to it.toUpperCase() }
    assertEquals(3, map.size)
    assertEquals("A", map[1])
    assertEquals("BB", map[2])
    assertEquals("CCC", map[3])
}
