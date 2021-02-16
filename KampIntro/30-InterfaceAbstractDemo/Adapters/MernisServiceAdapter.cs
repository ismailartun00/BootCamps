using _30_InterfaceAbstractDemo.Abstract;
using _30_InterfaceAbstractDemo.Entities;
using _30_InterfaceAbstractDemo.Adapters;
using MernisServiceReference;
using System;
using System.Collections.Generic;
using System.Text;

namespace _30_InterfaceAbstractDemo.Adapters {
    public class MernisServiceAdapter : ICustomerCheckService {
        public bool CheckIfRealPerson(Customer customer) {
            KPSPublicSoapClient client = new KPSPublicSoapClient(KPSPublicSoapClient.EndpointConfiguration.KPSPublicSoap);
            return client.TCKimlikNoDogrulaAsync(
                new TCKimlikNoDogrulaRequest
                (new TCKimlikNoDogrulaRequestBody(Convert.ToInt64(customer.NationalityId), customer.FirstName.ToUpper(),
                customer.LastName.ToUpper(), customer.DateOfBirth.Year))).Result.Body.TCKimlikNoDogrulaResult;
        }


    }
}
