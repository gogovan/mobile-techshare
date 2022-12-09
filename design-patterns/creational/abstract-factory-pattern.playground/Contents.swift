import UIKit

// FactoryProtocol.swift

protocol Chair {
    func hasLegs()
    func sitOn()
}

protocol CoffeeTable {
    func pattern()
    func color()
}

protocol Sofa {
    func pattern()
    func sitOn()
}

protocol Factory {
    func createChair() -> Chair
    func createCoffeeTable() -> CoffeeTable
    func createSofa() -> Sofa
}

// ArtDeco.swift

class ArtDecoChair: Chair {
    func hasLegs() {
        print("ArtDeco style legs")
    }

    func sitOn() {
        print("ArtDeco style sitOn")
    }
}

class ArtDecoCoffeeTable: CoffeeTable {
    func pattern() {
        print("ArtDeco pattern")
    }
    
    func color() {
        print("ArtDeco style color")
    }
}

class ArtDecoSofa: Sofa {
    func pattern() {
        print("ArtDeco pattern")
    }
    
    func sitOn() {
        print("ArtDeco style chair")
    }
}

class ArtDecoFactory: Factory {
    func createChair() -> Chair {
        return ArtDecoChair()
    }
    
    func createCoffeeTable() -> CoffeeTable {
        return ArtDecoCoffeeTable()
    }
    
    func createSofa() -> Sofa {
        return ArtDecoSofa()
    }
}

// Victorian.swift

class VictorianChair: Chair {
    func hasLegs() {
        print("Victorian style legs")
    }

    func sitOn() {
        print("Victorian style sitOn")
    }
}

class VictorianCoffeeTable: CoffeeTable {
    func pattern() {
        print("Victorian pattern")
    }
    
    func color() {
        print("Victorian style color")
    }
}

class VictorianSofa: Sofa {
    func pattern() {
        print("Victorian pattern")
    }
    
    func sitOn() {
        print("Victorian style chair")
    }
}

class VictorianFactory: Factory {
    func createChair() -> Chair {
        return VictorianChair()
    }
    
    func createCoffeeTable() -> CoffeeTable {
        return VictorianCoffeeTable()
    }
    
    func createSofa() -> Sofa {
        return VictorianSofa()
    }
}

// ... skip modern

// Scenario:
// Customers come to machine, and enter factory and type, and get furniture, then can print furniture's characteristic

// machine.swift

enum FunitureType {
    case chair
    case coffeeTable
    case sofa
}

//

func machine(factory: Factory, type: FunitureType) {
    switch type {
    case .chair:
        let chair = factory.createChair()
        chair.hasLegs()
        chair.sitOn()
    case .coffeeTable:
        let coffee = factory.createCoffeeTable()
        coffee.pattern()
        coffee.color()
    case .sofa:
        let sofa = factory.createSofa()
        sofa.pattern()
        sofa.sitOn()
    }
}


print("1-------------------- Coustomer")
machine(factory: VictorianFactory(), type: .sofa)

print("2-------------------- Coustomer")
machine(factory: ArtDecoFactory(), type: .chair)


