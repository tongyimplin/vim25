package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.ProfileExpressionMetadata;
import com.vmware.vim25.ProfileParameterMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExpressionMetadata", propOrder = {"expressionId", "parameter"})
public class ProfileExpressionMetadata extends DynamicData {
  @XmlElement(required = true)
  protected ExtendedElementDescription expressionId;
  
  protected List<ProfileParameterMetadata> parameter;
  
  public ExtendedElementDescription getExpressionId() {
    return this.expressionId;
  }
  
  public void setExpressionId(ExtendedElementDescription paramExtendedElementDescription) {
    this.expressionId = paramExtendedElementDescription;
  }
  
  public List<ProfileParameterMetadata> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
