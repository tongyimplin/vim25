package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineVideoCardUse3DRenderer;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineVideoCardUse3dRenderer")
@XmlEnum
public enum VirtualMachineVideoCardUse3DRenderer {
  AUTOMATIC("automatic"),
  SOFTWARE("software"),
  HARDWARE("hardware");
  
  private final String value;
  
  VirtualMachineVideoCardUse3DRenderer(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineVideoCardUse3DRenderer fromValue(String paramString) {
    for (VirtualMachineVideoCardUse3DRenderer virtualMachineVideoCardUse3DRenderer : values()) {
      if (virtualMachineVideoCardUse3DRenderer.value.equals(paramString))
        return virtualMachineVideoCardUse3DRenderer; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
