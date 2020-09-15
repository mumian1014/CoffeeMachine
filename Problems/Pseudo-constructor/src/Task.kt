class Point3D(x: Int, y:Int, z:Int) {
    val x = x
    val y = y
    val z = z
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    return Point3D(x, y, z)
}