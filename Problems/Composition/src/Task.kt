data class OperatingSystem(var name : String = "Unknown")

class DualBoot {
    var primaryOs = OperatingSystem("Linux")
    var secondaryOs = OperatingSystem("Windows")
}