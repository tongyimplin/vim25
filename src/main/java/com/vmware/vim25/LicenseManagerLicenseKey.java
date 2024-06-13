package com.vmware.vim25;

import com.vmware.vim25.LicenseManagerLicenseKey;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseManagerLicenseKey")
@XmlEnum
public enum LicenseManagerLicenseKey {
  ESX_FULL("esxFull"),
  ESX_VMTN("esxVmtn"),
  ESX_EXPRESS("esxExpress"),
  SAN("san"),
  ISCSI("iscsi"),
  NAS("nas"),
  VSMP("vsmp"),
  BACKUP("backup"),
  VC("vc"),
  VC_EXPRESS("vcExpress"),
  ESX_HOST("esxHost"),
  GSX_HOST("gsxHost"),
  SERVER_HOST("serverHost"),
  DRS_POWER("drsPower"),
  VMOTION("vmotion"),
  DRS("drs"),
  DAS("das");
  
  private final String value;
  
  LicenseManagerLicenseKey(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseManagerLicenseKey fromValue(String paramString) {
    for (LicenseManagerLicenseKey licenseManagerLicenseKey : values()) {
      if (licenseManagerLicenseKey.value.equals(paramString))
        return licenseManagerLicenseKey; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
