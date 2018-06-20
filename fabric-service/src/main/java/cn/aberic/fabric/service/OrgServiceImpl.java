package cn.aberic.fabric.service;

import cn.aberic.fabric.mapper.OrgMapper;
import cn.aberic.thrift.org.OrgInfo;
import cn.aberic.thrift.org.OrgService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orgService")
public class OrgServiceImpl implements OrgService.Iface {

    @Resource
    private OrgMapper orgMapper;


    @Override
    public int add(OrgInfo orgInfo) throws TException {
        return 0;
    }

    @Override
    public int update(OrgInfo orgInfo) throws TException {
        return 0;
    }

    @Override
    public List<OrgInfo> listAll() throws TException {
        return orgMapper.listAll();
    }

    @Override
    public List<OrgInfo> listById(int id) throws TException {
        return null;
    }

    @Override
    public OrgInfo get(int id) throws TException {
        return null;
    }

    @Override
    public int countById(int id) throws TException {
        return 0;
    }

    @Override
    public int count() throws TException {
        return 0;
    }
}