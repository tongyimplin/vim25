package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.ProfilePolicyMetadata;
import com.vmware.vim25.ProfilePolicyOptionMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilePolicyMetadata", propOrder = {"id", "possibleOption"})
public class ProfilePolicyMetadata extends DynamicData {
  @XmlElement(required = true)
  protected ExtendedElementDescription id;
  
  @XmlElement(required = true)
  protected List<ProfilePolicyOptionMetadata> possibleOption;
  
  public ExtendedElementDescription getId() {
    return this.id;
  }
  
  public void setId(ExtendedElementDescription paramExtendedElementDescription) {
    this.id = paramExtendedElementDescription;
  }
  
  public List<ProfilePolicyOptionMetadata> getPossibleOption() {
    if (this.possibleOption == null)
      this.possibleOption = new ArrayList<>(); 
    return this.possibleOption;
  }
}
