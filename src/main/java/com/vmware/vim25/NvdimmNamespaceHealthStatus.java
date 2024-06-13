package com.vmware.vim25;

import com.vmware.vim25.NvdimmNamespaceHealthStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNamespaceHealthStatus")
@XmlEnum
public enum NvdimmNamespaceHealthStatus {
  NORMAL("normal"),
  MISSING("missing"),
  LABEL_MISSING("labelMissing"),
  INTERLEAVE_BROKEN("interleaveBroken"),
  LABEL_INCONSISTENT("labelInconsistent"),
  BTT_CORRUPT("bttCorrupt"),
  BAD_BLOCK_SIZE("badBlockSize");
  
  private final String value;
  
  NvdimmNamespaceHealthStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNamespaceHealthStatus fromValue(String paramString) {
    for (NvdimmNamespaceHealthStatus nvdimmNamespaceHealthStatus : values()) {
      if (nvdimmNamespaceHealthStatus.value.equals(paramString))
        return nvdimmNamespaceHealthStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
