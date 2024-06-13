package com.vmware.vim25;

import com.vmware.vim25.CustomizationGuiRunOnce;
import com.vmware.vim25.CustomizationGuiUnattended;
import com.vmware.vim25.CustomizationIdentification;
import com.vmware.vim25.CustomizationIdentitySettings;
import com.vmware.vim25.CustomizationLicenseFilePrintData;
import com.vmware.vim25.CustomizationSysprep;
import com.vmware.vim25.CustomizationUserData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSysprep", propOrder = {"guiUnattended", "userData", "guiRunOnce", "identification", "licenseFilePrintData"})
public class CustomizationSysprep extends CustomizationIdentitySettings {
  @XmlElement(required = true)
  protected CustomizationGuiUnattended guiUnattended;
  
  @XmlElement(required = true)
  protected CustomizationUserData userData;
  
  protected CustomizationGuiRunOnce guiRunOnce;
  
  @XmlElement(required = true)
  protected CustomizationIdentification identification;
  
  protected CustomizationLicenseFilePrintData licenseFilePrintData;
  
  public CustomizationGuiUnattended getGuiUnattended() {
    return this.guiUnattended;
  }
  
  public void setGuiUnattended(CustomizationGuiUnattended paramCustomizationGuiUnattended) {
    this.guiUnattended = paramCustomizationGuiUnattended;
  }
  
  public CustomizationUserData getUserData() {
    return this.userData;
  }
  
  public void setUserData(CustomizationUserData paramCustomizationUserData) {
    this.userData = paramCustomizationUserData;
  }
  
  public CustomizationGuiRunOnce getGuiRunOnce() {
    return this.guiRunOnce;
  }
  
  public void setGuiRunOnce(CustomizationGuiRunOnce paramCustomizationGuiRunOnce) {
    this.guiRunOnce = paramCustomizationGuiRunOnce;
  }
  
  public CustomizationIdentification getIdentification() {
    return this.identification;
  }
  
  public void setIdentification(CustomizationIdentification paramCustomizationIdentification) {
    this.identification = paramCustomizationIdentification;
  }
  
  public CustomizationLicenseFilePrintData getLicenseFilePrintData() {
    return this.licenseFilePrintData;
  }
  
  public void setLicenseFilePrintData(CustomizationLicenseFilePrintData paramCustomizationLicenseFilePrintData) {
    this.licenseFilePrintData = paramCustomizationLicenseFilePrintData;
  }
}
