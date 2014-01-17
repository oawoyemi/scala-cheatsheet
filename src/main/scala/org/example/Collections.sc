val m1 = Map(1 -> "a", 3 -> "c", 5 -> "e")

val overrideValueInImmutableMap = m1 + (1 -> "z")

val addValueToImmutableMap = m1 + (7->"y")

val filterMapByKeys = m1 filterKeys Set(1,3)

val flattenMapValues = Map("key1" -> Some("value1"), "key2" -> None, "key3" -> Some("value3")).collect {
                                                                                  case (key, Some(value)) => key -> value }

val mapToList = Map("planned"->0,"event"->1,"active"->0)
mapToList map {case (key, 1) => Some(key) case _ => None}