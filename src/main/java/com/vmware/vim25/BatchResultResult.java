package com.vmware.vim25;

import com.vmware.vim25.BatchResultResult;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BatchResultResult")
@XmlEnum
public enum BatchResultResult {
  SUCCESS("success"),
  FAIL("fail");
  
  private final String value;
  
  BatchResultResult(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static BatchResultResult fromValue(String paramString) {
    for (BatchResultResult batchResultResult : values()) {
      if (batchResultResult.value.equals(paramString))
        return batchResultResult; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
