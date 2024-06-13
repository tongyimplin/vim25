package com.vmware.vim25;

import com.vmware.vim25.VmDasBeingResetEvent;
import com.vmware.vim25.VmDasBeingResetWithScreenshotEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDasBeingResetWithScreenshotEvent", propOrder = {"screenshotFilePath"})
public class VmDasBeingResetWithScreenshotEvent extends VmDasBeingResetEvent {
  @XmlElement(required = true)
  protected String screenshotFilePath;
  
  public String getScreenshotFilePath() {
    return this.screenshotFilePath;
  }
  
  public void setScreenshotFilePath(String paramString) {
    this.screenshotFilePath = paramString;
  }
}
