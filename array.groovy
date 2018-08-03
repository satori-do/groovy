println " - MAPS -"
def someMap = [ 'a' : 1, 'b' : 2 ]   // Variable declaration

// Declaration an empty mapping
def emptyMap = [:]
def otherEmptyMap = [:] as HashMap

println someMap['a']                 // Item access
println someMap.a                    // Accessing the item as a field

someMap['a'] = 2                     // Change item
someMap.a = 2                        // Change the item as a field

println someMap['a']                 // Item access
println someMap.a                    // Accessing the item as a field
