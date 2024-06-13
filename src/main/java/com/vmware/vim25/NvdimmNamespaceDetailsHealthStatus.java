package com.vmware.vim25;

import com.vmware.vim25.NvdimmNamespaceDetailsHealthStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNamespaceDetailsHealthStatus")
@XmlEnum
public enum NvdimmNamespaceDetailsHealthStatus {
  NORMAL("normal"),
  MISSING("missing"),
  LABEL_MISSING("labelMissing"),
  INTERLEAVE_BROKEN("interleaveBroken"),
  LABEL_INCONSISTENT("labelInconsistent");
  
  private final String value;
  
  NvdimmNamespaceDetailsHealthStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNamespaceDetailsHealthStatus fromValue(String paramString) {
    for (NvdimmNamespaceDetailsHealthStatus nvdimmNamespaceDetailsHealthStatus : values()) {
      if (nvdimmNamespaceDetailsHealthStatus.value.equals(paramString))
        return nvdimmNamespaceDetailsHealthStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
