package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ProfileDescriptionSection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDescriptionSection", propOrder = {"description", "message"})
public class ProfileDescriptionSection extends DynamicData {
  @XmlElement(required = true)
  protected ExtendedElementDescription description;
  
  protected List<LocalizableMessage> message;
  
  public ExtendedElementDescription getDescription() {
    return this.description;
  }
  
  public void setDescription(ExtendedElementDescription paramExtendedElementDescription) {
    this.description = paramExtendedElementDescription;
  }
  
  public List<LocalizableMessage> getMessage() {
    if (this.message == null)
      this.message = new ArrayList<>(); 
    return this.message;
  }
}
