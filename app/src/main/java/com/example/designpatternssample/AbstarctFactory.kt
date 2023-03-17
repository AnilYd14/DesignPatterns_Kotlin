package com.example.designpatternssample

/**
 * Created by Anil Yadav on 16/03/23.
 */

enum class VehicleType {
    LUXURY,
    ORDINARY
}

interface Vehicle {
    fun average()
}

class LuxuryV1 : Vehicle {
    override fun average() {}
}

class OrdinaryV1 : Vehicle {
    override fun average() {}
}

class LuxuryV2 : Vehicle {
    override fun average() {}
}

class OrdinaryV2 : Vehicle {
    override fun average() {}
}

interface VehicleFactory {
    fun getVehicle(vehicleType: String): Vehicle
}

class LuxuryVehicleFactory : VehicleFactory {
    override fun getVehicle(vehicleType: String): Vehicle {
        return when (vehicleType) {
            "bmw" -> LuxuryV1()
            "audi" -> LuxuryV2()
            else -> LuxuryV1()
        }
    }

}

class OrdinaryVehicleFactory : VehicleFactory {

    override fun getVehicle(vehicleType: String): Vehicle {

        return when (vehicleType) {
            "swift" -> OrdinaryV1()
            "hyundai" -> OrdinaryV2()
            else -> OrdinaryV1()
        }
    }

}

class VehicleFactoryProvider {
    companion object {
        fun getVehicleFactory(factoryType: VehicleType): VehicleFactory? {
            return when (factoryType) {
                VehicleType.LUXURY -> LuxuryVehicleFactory()
                VehicleType.ORDINARY -> OrdinaryVehicleFactory()
                else -> null
            }
        }
    }
}
