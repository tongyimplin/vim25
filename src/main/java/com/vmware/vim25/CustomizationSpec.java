package com.vmware.vim25;

import com.vmware.vim25.CustomizationAdapterMapping;
import com.vmware.vim25.CustomizationGlobalIPSettings;
import com.vmware.vim25.CustomizationIdentitySettings;
import com.vmware.vim25.CustomizationOptions;
import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpec", propOrder = {"options", "identity", "globalIPSettings", "nicSettingMap", "encryptionKey"})
public class CustomizationSpec extends DynamicData {
  protected CustomizationOptions options;
  
  @XmlElement(required = true)
  protected CustomizationIdentitySettings identity;
  
  @XmlElement(required = true)
  protected CustomizationGlobalIPSettings globalIPSettings;
  
  protected List<CustomizationAdapterMapping> nicSettingMap;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> encryptionKey;
  
  public CustomizationOptions getOptions() {
    return this.options;
  }
  
  public void setOptions(CustomizationOptions paramCustomizationOptions) {
    this.options = paramCustomizationOptions;
  }
  
  public CustomizationIdentitySettings getIdentity() {
    return this.identity;
  }
  
  public void setIdentity(CustomizationIdentitySettings paramCustomizationIdentitySettings) {
    this.identity = paramCustomizationIdentitySettings;
  }
  
  public CustomizationGlobalIPSettings getGlobalIPSettings() {
    return this.globalIPSettings;
  }
  
  public void setGlobalIPSettings(CustomizationGlobalIPSettings paramCustomizationGlobalIPSettings) {
    this.globalIPSettings = paramCustomizationGlobalIPSettings;
  }
  
  public List<CustomizationAdapterMapping> getNicSettingMap() {
    if (this.nicSettingMap == null)
      this.nicSettingMap = new ArrayList<>(); 
    return this.nicSettingMap;
  }
  
  public List<Byte> getEncryptionKey() {
    if (this.encryptionKey == null)
      this.encryptionKey = new ArrayList<>(); 
    return this.encryptionKey;
  }
}
