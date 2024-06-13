package com.vmware.vim25;

import com.vmware.vim25.VMwareDVSVspanSessionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDVSVspanSessionType")
@XmlEnum
public enum VMwareDVSVspanSessionType {
  MIXED_DEST_MIRROR("mixedDestMirror"),
  DV_PORT_MIRROR("dvPortMirror"),
  REMOTE_MIRROR_SOURCE("remoteMirrorSource"),
  REMOTE_MIRROR_DEST("remoteMirrorDest"),
  ENCAPSULATED_REMOTE_MIRROR_SOURCE("encapsulatedRemoteMirrorSource");
  
  private final String value;
  
  VMwareDVSVspanSessionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDVSVspanSessionType fromValue(String paramString) {
    for (VMwareDVSVspanSessionType vMwareDVSVspanSessionType : values()) {
      if (vMwareDVSVspanSessionType.value.equals(paramString))
        return vMwareDVSVspanSessionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
