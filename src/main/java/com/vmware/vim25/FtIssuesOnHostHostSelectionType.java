package com.vmware.vim25;

import com.vmware.vim25.FtIssuesOnHostHostSelectionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FtIssuesOnHostHostSelectionType")
@XmlEnum
public enum FtIssuesOnHostHostSelectionType {
  USER("user"),
  VC("vc"),
  DRS("drs");
  
  private final String value;
  
  FtIssuesOnHostHostSelectionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static FtIssuesOnHostHostSelectionType fromValue(String paramString) {
    for (FtIssuesOnHostHostSelectionType ftIssuesOnHostHostSelectionType : values()) {
      if (ftIssuesOnHostHostSelectionType.value.equals(paramString))
        return ftIssuesOnHostHostSelectionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
