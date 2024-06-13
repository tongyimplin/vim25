package com.vmware.vim25;

import com.vmware.vim25.HostSystemIdentificationInfoIdentifier;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSystemIdentificationInfoIdentifier")
@XmlEnum
public enum HostSystemIdentificationInfoIdentifier {
  ASSET_TAG("AssetTag"),
  SERVICE_TAG("ServiceTag"),
  OEM_SPECIFIC_STRING("OemSpecificString"),
  ENCLOSURE_SERIAL_NUMBER_TAG("EnclosureSerialNumberTag"),
  SERIAL_NUMBER_TAG("SerialNumberTag");
  
  private final String value;
  
  HostSystemIdentificationInfoIdentifier(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSystemIdentificationInfoIdentifier fromValue(String paramString) {
    for (HostSystemIdentificationInfoIdentifier hostSystemIdentificationInfoIdentifier : values()) {
      if (hostSystemIdentificationInfoIdentifier.value.equals(paramString))
        return hostSystemIdentificationInfoIdentifier; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
