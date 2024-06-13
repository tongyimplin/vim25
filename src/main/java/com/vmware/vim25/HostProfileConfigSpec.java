package com.vmware.vim25;

import com.vmware.vim25.HostProfileCompleteConfigSpec;
import com.vmware.vim25.HostProfileHostBasedConfigSpec;
import com.vmware.vim25.ProfileCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileConfigSpec")
@XmlSeeAlso({HostProfileCompleteConfigSpec.class, HostProfileHostBasedConfigSpec.class})
public class HostProfileConfigSpec extends ProfileCreateSpec {}
