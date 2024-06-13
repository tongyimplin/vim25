package com.vmware.vim25;

import com.vmware.vim25.PerformanceManagerUnit;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PerformanceManagerUnit")
@XmlEnum
public enum PerformanceManagerUnit {
  PERCENT("percent"),
  KILO_BYTES("kiloBytes"),
  MEGA_BYTES("megaBytes"),
  MEGA_HERTZ("megaHertz"),
  NUMBER("number"),
  MICROSECOND("microsecond"),
  MILLISECOND("millisecond"),
  SECOND("second"),
  KILO_BYTES_PER_SECOND("kiloBytesPerSecond"),
  MEGA_BYTES_PER_SECOND("megaBytesPerSecond"),
  WATT("watt"),
  JOULE("joule"),
  TERA_BYTES("teraBytes"),
  CELSIUS("celsius");
  
  private final String value;
  
  PerformanceManagerUnit(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PerformanceManagerUnit fromValue(String paramString) {
    for (PerformanceManagerUnit performanceManagerUnit : values()) {
      if (performanceManagerUnit.value.equals(paramString))
        return performanceManagerUnit; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
