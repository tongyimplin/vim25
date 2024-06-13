package com.vmware.vim25;

import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LicenseDowngradeDisallowed;
import com.vmware.vim25.NotEnoughLicenses;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseDowngradeDisallowed", propOrder = {"edition", "entityId", "features"})
public class LicenseDowngradeDisallowed extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected String edition;
  
  @XmlElement(required = true)
  protected String entityId;
  
  @XmlElement(required = true)
  protected List<KeyAnyValue> features;
  
  public String getEdition() {
    return this.edition;
  }
  
  public void setEdition(String paramString) {
    this.edition = paramString;
  }
  
  public String getEntityId() {
    return this.entityId;
  }
  
  public void setEntityId(String paramString) {
    this.entityId = paramString;
  }
  
  public List<KeyAnyValue> getFeatures() {
    if (this.features == null)
      this.features = new ArrayList<>(); 
    return this.features;
  }
}
