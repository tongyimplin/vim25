package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SessionManagerHttpServiceRequestSpec;
import com.vmware.vim25.SessionManagerVmomiServiceRequestSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagerServiceRequestSpec")
@XmlSeeAlso({SessionManagerHttpServiceRequestSpec.class, SessionManagerVmomiServiceRequestSpec.class})
public class SessionManagerServiceRequestSpec extends DynamicData {}
