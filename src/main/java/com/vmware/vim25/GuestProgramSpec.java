package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.GuestWindowsProgramSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestProgramSpec", propOrder = {"programPath", "arguments", "workingDirectory", "envVariables"})
@XmlSeeAlso({GuestWindowsProgramSpec.class})
public class GuestProgramSpec extends DynamicData {
  @XmlElement(required = true)
  protected String programPath;
  
  @XmlElement(required = true)
  protected String arguments;
  
  protected String workingDirectory;
  
  protected List<String> envVariables;
  
  public String getProgramPath() {
    return this.programPath;
  }
  
  public void setProgramPath(String paramString) {
    this.programPath = paramString;
  }
  
  public String getArguments() {
    return this.arguments;
  }
  
  public void setArguments(String paramString) {
    this.arguments = paramString;
  }
  
  public String getWorkingDirectory() {
    return this.workingDirectory;
  }
  
  public void setWorkingDirectory(String paramString) {
    this.workingDirectory = paramString;
  }
  
  public List<String> getEnvVariables() {
    if (this.envVariables == null)
      this.envVariables = new ArrayList<>(); 
    return this.envVariables;
  }
}
