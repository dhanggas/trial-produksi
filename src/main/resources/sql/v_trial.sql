CREATE VIEW v_trial AS SELECT

    tb_trial.id_trial AS 'id_trial',
    tb_trial.tanggal AS 'tanggal',
    
    tb_dies.id_dies AS 'id_dies',
    tb_dies.nama AS 'nama_dies',
    tb_dies.proses AS 'proses_dies',
    tb_dies.customer AS 'customer_dies',

    tb_mesin.id_mesin AS 'id_mesin',
    tb_mesin.nama AS 'nama_mesin',
    

    tb_kepala.id_kepala AS 'id_kepala',
    tb_kepala.nama AS 'nama_kepala',
    

    tb_operator.id_operator AS 'id_operator',
    tb_operator.nama AS 'nama_operator',
    tb_trial.mulai AS 'mulai',
    tb_trial.selesai AS 'selesai'
    
FROM

tb_trial
LEFT JOIN tb_dies USING(id_dies)
LEFT JOIN tb_mesin USING(id_mesin)
LEFT JOIN tb_kepala USING(id_kepala)
LEFT JOIN tb_operator USING(id_operator)