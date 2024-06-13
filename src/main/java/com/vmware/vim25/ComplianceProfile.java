package com.vmware.vim25;

import com.vmware.vim25.ComplianceProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceProfile", propOrder = {"expression", "rootExpression"})
public class ComplianceProfile extends DynamicData {
  @XmlElement(required = true)
  protected List<ProfileExpression> expression;
  
  @XmlElement(required = true)
  protected String rootExpression;
  
  public List<ProfileExpression> getExpression() {
    if (this.expression == null)
      this.expression = new ArrayList<>(); 
    return this.expression;
  }
  
  public String getRootExpression() {
    return this.rootExpression;
  }
  
  public void setRootExpression(String paramString) {
    this.rootExpression = paramString;
  }
}
