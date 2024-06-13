package com.vmware.vim25;

import com.vmware.vim25.FolderDesiredHostState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FolderDesiredHostState")
@XmlEnum
public enum FolderDesiredHostState {
  MAINTENANCE("maintenance"),
  NON_MAINTENANCE("non_maintenance");
  
  private final String value;
  
  FolderDesiredHostState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static FolderDesiredHostState fromValue(String paramString) {
    for (FolderDesiredHostState folderDesiredHostState : values()) {
      if (folderDesiredHostState.value.equals(paramString))
        return folderDesiredHostState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
